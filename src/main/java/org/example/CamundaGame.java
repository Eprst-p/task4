package org.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * This is an easy adapter implementation
 * illustrating how a Java Delegate can be used
 * from within a BPMN 2.0 Service Task.
 */
public class CamundaGame implements JavaDelegate {

  public void execute(DelegateExecution execution) throws Exception {
    int randomValue = (int)Math.floor(Math.random()*(200 + 1));
    execution.setVariableLocal("resultCoin", randomValue);
  }

}
