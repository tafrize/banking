package com.project.bankingserver.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
public class OperationNonPermittedException extends RuntimeException {

  private final String errorMsg;

  private final String operationId;

  private final String source;

  private final String dependency;

  public OperationNonPermittedException(String errorMsg, String operationId, String source, String dependency) {
    this.errorMsg = errorMsg;
    this.operationId = operationId;
    this.source = source;
    this.dependency = dependency;
  }

}
