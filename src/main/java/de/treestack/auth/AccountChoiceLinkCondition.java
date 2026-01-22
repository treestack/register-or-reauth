package de.treestack.auth;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.AuthenticationFlowError;
import org.keycloak.authentication.authenticators.conditional.ConditionalAuthenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class AccountChoiceLinkCondition implements ConditionalAuthenticator {

    @Override
    public boolean matchCondition(AuthenticationFlowContext authenticationFlowContext) {
        String choice = authenticationFlowContext.getAuthenticationSession().getAuthNote("ACCOUNT_CHOICE");
        return "LINK".equals(choice);
    }

    @Override
    public void action(AuthenticationFlowContext context) {
    }

    @Override
    public boolean requiresUser() {
        return false;
    }

    @Override
    public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user) {
    }

    @Override
    public void close() {
    }
}