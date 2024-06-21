package io.mosip.registration.controller.reg;

import org.springframework.stereotype.Component;

/**
 * Class for validation of the NRCID Field
 *
 * @author Avanish Duggireddy
 * @since 1.0.0
 *
 */
@Component
public class NRCIDValidatorImpl {

    private String nrcIdRegex = "^[0-9]{6}[/][0-9]{2}[/][0-9]{1}$";

    public boolean validateId(String nrcId) {

        if (nrcId.matches(nrcIdRegex))
            return true;
        else
            return false;
    }
}

