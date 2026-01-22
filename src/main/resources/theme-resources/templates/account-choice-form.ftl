<#import "template.ftl" as layout>
<@layout.registrationLayout displayMessage=!messagesPerField.existsError('username','password') displayInfo=false; section>
    <#if section = "header">
        ${msg("accountChoiceTitle")}
    <#elseif section = "form">
        <div id="kc-form">
            <div id="kc-form-wrapper">
                <form id="kc-account-choice-form" action="${url.loginAction}" method="post">

                    <div class="account-choice-info">
                        <p>${msg("accountChoiceDescription")}</p>
                    </div>

                    <div class="${properties.kcFormGroupClass!}">
                        <button type="submit"
                                class="${properties.kcButtonClass!} ${properties.kcButtonPrimaryClass!} ${properties.kcButtonBlockClass!}"
                                name="account_action"
                                value="link">
                            ${msg("linkExistingAccount")}
                        </button>
                    </div>

                    <div class="${properties.kcFormGroupClass!}">
                        <button type="submit"
                                class="${properties.kcButtonClass!} ${properties.kcButtonDefaultClass!} ${properties.kcButtonBlockClass!}"
                                name="account_action"
                                value="create">
                            ${msg("createNewAccount")}
                        </button>
                    </div>

                </form>
            </div>
        </div>
    </#if>
</@layout.registrationLayout>