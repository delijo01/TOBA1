<%-- 
    Document   : TransferFunds
    Created on : Apr 20, 2017, 11:53:38 PM
    Author     : delijo01
<!-- 
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
-->
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<!-- Add the tag library to the page -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<!-- Add the header to the page -->
<c:import url="/includes/header.html" />
        <h1>Transfer Funds Page</h1>
        
        <form action="TransactionServlet" method="post">
            <label>First Name:</label>
            <span>${user.firstName}</span><br>
            <label>Last Name:</label>
            <span>${user.lastName}</span><br>
            <label>Current Checking Balance:</label>
            <span>${account.Checking}</span><br>
            <label>Current Savings Balance:</label>
            <span>${account.Savings}</span><br>
            
            <label class="pad_top" id="lblCheck" title="Checking" >Transfer From Checking: </label>
            <!--Created the input for the Transfer Checking-->
            <input type="text" id="txtCheck" name="Checking"><br>
            
            <label class="pad_top" id="lblSave" title="Savings" >Transfer From Savings: </label>
            <!--Created the input for the Transfer Savings-->
            <input type="text" id="txtSave" name="Savings"><br>
            
            <input type="submit" value ="Transfer">
        </form>
<!-- Add the footer to the page -->        
<c:import url="/includes/footer.jsp" />
