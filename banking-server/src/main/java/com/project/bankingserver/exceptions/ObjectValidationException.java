package com.project.bankingserver.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.util.Set;


public class ObjectValidationException extends RuntimeException {

    @Getter
    private final Set<String> violations;

    @Getter
    private final String violationSource;

    public ObjectValidationException(Set<String> violations, String violationSource) {
        super("Validation failed for " + violationSource + ": " + String.join(", ", violations));
        this.violations = violations;
        this.violationSource = violationSource;
    }


}
