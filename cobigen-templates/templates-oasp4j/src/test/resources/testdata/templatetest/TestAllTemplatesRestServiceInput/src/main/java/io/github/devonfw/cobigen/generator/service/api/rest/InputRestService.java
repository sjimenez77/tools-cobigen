package io.github.devonfw.cobigen.generator.service.api.rest;

public interface InputRestService {

  public String getVisitor(long id);

  public String saveVisitor(String visitor);

  public void deleteVisitor(long id);

}