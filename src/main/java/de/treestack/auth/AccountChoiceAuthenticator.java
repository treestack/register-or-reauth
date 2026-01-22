package de.treestack.auth;

import org.keycloak.authentication.Authenticator;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.AuthenticationFlowError;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.services.messages.Messages;

import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;

public class AccountChoiceAuthenticator implements Authenticator {

    @Override
    public void authenticate(AuthenticationFlowContext context) {
        // Simply show the choice form without checking anything
        Response challenge = context.form()
                .createForm("account-choice-form.ftl");
        context.challenge(challenge);
    }

    @Override
    public void action(AuthenticationFlowContext context) {
        MultivaluedMap<String, String> formData =
                context.getHttpRequest().getDecodedFormParameters();

        String choice = formData.getFirst("account_action");

        if ("link".equals(choice)) {
            // User wants to link with existing account
            // Set a note so subsequent authenticators know to do linking
            context.getAuthenticationSession()
                    .setAuthNote("ACCOUNT_CHOICE", "LINK");
            context.success();

        } else if ("create".equals(choice)) {
            // User wants to create new account
            context.getAuthenticationSession()
                    .setAuthNote("ACCOUNT_CHOICE", "CREATE");
            context.success();

        } else {
            // No valid choice
            Response challenge = context.form()
                    .setError(Messages.INVALID_REQUEST)
                    .createForm("account-choice-form.ftl");
            context.failureChallenge(AuthenticationFlowError.INVALID_CREDENTIALS, challenge);
        }
    }

    @Override
    public boolean requiresUser() {
        return false;
    }

    @Override
    public boolean configuredFor(KeycloakSession session, RealmModel realm, UserModel user) {
        return true;
    }

    @Override
    public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user) {
        // Nothing to do
    }

    @Override
    public void close() {
        // Nothing to close
    }
}
