package jp.afterfit.core.oauth2.validation;

import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;

public class AudienceValidator implements OAuth2TokenValidator<Jwt> {

    private OAuth2Error error = new OAuth2Error("invalid_token", "The required audience is missing", null);

    private String clientId;

    public AudienceValidator(String clientId) {
        this.clientId = clientId;
    }

    public OAuth2TokenValidatorResult validate(Jwt jwt) {
        if (jwt.getAudience().contains(clientId)) {
            return OAuth2TokenValidatorResult.success();
        }
        return OAuth2TokenValidatorResult.failure(error);
    }
}
