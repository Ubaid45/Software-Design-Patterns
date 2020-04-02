package com.practice.behaviroal.patterns.command;


import com.practice.behaviroal.patterns.command.fx.Command;

public class AddCustomerCommand implements Command {
  private CustomerService service;

  public AddCustomerCommand(CustomerService service) {
    this.service = service;
  }

  @Override
  public void execute() {
    service.addCustomer();
  }
}
