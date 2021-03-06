/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TestModule2Impl extends ApplicationModuleImpl {
  /**This is the default constructor (do not remove)
   */
  public TestModule2Impl() {
  }

  /**Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test.model", /* package name */
      "TestModule2Local" /* Configuration Name */);
  }

  /**Container's getter for AllEmployees
   */
  public EmpViewImpl getAllEmployees() {
    return (EmpViewImpl)findViewObject("AllEmployees");
  }

  /**Container's getter for Departments
   */
  public DeptViewImpl getDepartments() {
    return (DeptViewImpl)findViewObject("Departments");
  }

  /**Container's getter for EmployeesInDepartment
   */
  public EmpViewImpl getEmployeesInDepartment() {
    return (EmpViewImpl)findViewObject("EmployeesInDepartment");
  }

  /**Container's getter for DeptAndEmpsLink1
   */
  public ViewLinkImpl getDeptAndEmpsLink1() {
    return (ViewLinkImpl)findViewLink("DeptAndEmpsLink1");
  }

  /**Container's getter for EmployeesReadOnly
   */
  public EmployeesReadOnlyImpl getEmployeesReadOnly() {
    return (EmployeesReadOnlyImpl)findViewObject("EmployeesReadOnly");
  }
}
