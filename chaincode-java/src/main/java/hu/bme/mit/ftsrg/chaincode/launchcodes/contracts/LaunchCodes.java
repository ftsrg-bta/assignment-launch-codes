/* SPDX-License-Identifier: Apache-2.0 */
package hu.bme.mit.ftsrg.chaincode.launchcodes.contracts;

import org.hyperledger.fabric.contract.Context;
import org.hyperledger.fabric.contract.ContractInterface;
import org.hyperledger.fabric.contract.annotation.Contact;
import org.hyperledger.fabric.contract.annotation.Contract;
import org.hyperledger.fabric.contract.annotation.Default;
import org.hyperledger.fabric.contract.annotation.Info;
import org.hyperledger.fabric.contract.annotation.License;
import org.hyperledger.fabric.contract.annotation.Transaction;
import org.hyperledger.fabric.contract.annotation.Transaction.TYPE;

@Contract(
    name = "hw-launch-codes",
    info =
        @Info(
            title = "Launch Codes",
            description = "Chaincode for the BTA homework L(a)unchCodes",
            version = "0.1.0",
            license = @License(name = "Apache-2.0"),
            contact =
                @Contact(
                    email = "john.doe@example.com",
                    name = "John Doe",
                    url = "http://example.com")))
@Default
public final class LaunchCodes implements ContractInterface {

  @Transaction(name = "Ping", intent = TYPE.EVALUATE)
  public String ping(Context ignoredCtx) {
    return "Pong";
  }

  @Transaction(name = "RegisterStaffCard", intent = TYPE.SUBMIT)
  public void registerStaffCard(Context ctx, String cardID, String carHolderName) {
    // ...
  }

  @Transaction(name = "RegisterSoldierCard", intent = TYPE.SUBMIT)
  public void registerSoldierCard(Context ctx, String cardID, String carHolderName) {
    // ...
  }

  @Transaction(name = "RegisterSecureFacility", intent = TYPE.SUBMIT)
  public void registerSecureFacility(
      Context ctx, String lockID, String facilityName, String soldierOneID, String soldierTwoID) {
    // ...
  }

  @Transaction(name = "RequestEntry", intent = TYPE.SUBMIT)
  public String requestEntry(Context ctx, String cardID, String lockID) {
    // ...
    return null; // return the request ID
  }

  @Transaction(name = "ApproveEntry", intent = TYPE.SUBMIT)
  public String approveEntry(Context ctx, String requestID, String soldierCardID) {
    // ...
    return requestID;
  }

  @Transaction(name = "RejectEntry", intent = TYPE.SUBMIT)
  public String rejectEntry(Context ctx, String requestID, String soldierCardID) {
    // ...
    return requestID;
  }

  @Transaction(name = "LogEntry", intent = TYPE.SUBMIT)
  public void logEntry(Context ctx, String requestID, String cardID) {
    // ...
  }

  @Transaction(name = "RequestExit", intent = TYPE.SUBMIT)
  public String requestExit(Context ctx, String cardID, String lockID) {
    // ...
    return null; // return the request ID
  }

  @Transaction(name = "ApproveExit", intent = TYPE.SUBMIT)
  public String approveExit(Context ctx, String requestID, String soldierCardID) {
    // ...
    return requestID;
  }

  @Transaction(name = "RejectExit", intent = TYPE.SUBMIT)
  public String rejectExit(Context ctx, String requestID, String soldierCardID) {
    // ...
    return requestID;
  }

  @Transaction(name = "LogExit", intent = TYPE.SUBMIT)
  public void logExit(Context ctx, String requestID, String cardID) {
    // ...
  }

  @Transaction(name = "InitiateShiftChange", intent = TYPE.SUBMIT)
  public String initiateShiftChange(
      Context ctx, String lockID, String newSoldiersID, String oldSoldiersID) {
    // ...
    return null; // return the request ID
  }

  @Transaction(name = "ApproveShiftChange", intent = TYPE.SUBMIT)
  public String approveShiftChange(Context ctx, String requestID, String oldSoldiersID) {
    // ...
    return requestID;
  }

  @Transaction(name = "RejectShiftChange", intent = TYPE.SUBMIT)
  public String rejectShiftChange(Context ctx, String requestID, String soldierID) {
    // ...
    return requestID;
  }

  // QUERIES

  @Transaction(name = "GetSecureFacility", intent = TYPE.EVALUATE)
  public String getSecureFacility(Context ctx, String lockID) {
    // ...
    return null;
  }

  @Transaction(name = "GetAllSecureFacilities", intent = TYPE.EVALUATE)
  public String getAllSecureFacilities(Context ctx) {
    // ...
    return null;
  }

  @Transaction(name = "GetEntryRequest", intent = TYPE.EVALUATE)
  public String getEntryRequest(Context ctx, String requestID) {
    // ...
    return null;
  }

  @Transaction(name = "GetAllEntryRequests", intent = TYPE.EVALUATE)
  public String getAllEntryRequests(Context ctx) {
    // ...
    return null;
  }

  @Transaction(name = "GetExitRequest", intent = TYPE.EVALUATE)
  public String getExitRequest(Context ctx, String requestID) {
    // ...
    return null;
  }

  @Transaction(name = "GetAllExitRequests", intent = TYPE.EVALUATE)
  public String getAllExitRequests(Context ctx) {
    // ...
    return null;
  }

  @Transaction(name = "GetShiftChangeRequest", intent = TYPE.EVALUATE)
  public String getShiftChangeRequest(Context ctx, String requestID) {
    // ...
    return null;
  }

  @Transaction(name = "GetAllShiftChangeRequests", intent = TYPE.EVALUATE)
  public String getAllShiftChangeRequests(Context ctx) {
    // ...
    return null;
  }

  @Transaction(name = "GetCard", intent = TYPE.EVALUATE)
  public String getCard(Context ctx, String cardID) {
    // ...
    return null;
  }

  @Transaction(name = "GetAllCards", intent = TYPE.EVALUATE)
  public String getAllCards(Context ctx) {
    // ...
    return null;
  }
}
