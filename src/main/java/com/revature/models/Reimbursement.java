package com.revature.models;

/**
 * This concrete Reimbursement class can include additional fields that can be used for
 * extended functionality of the ERS application.
 *
 * Example fields:
 * <ul>
 *     <li>Description</li>
 *     <li>Creation Date</li>
 *     <li>Resolution Date</li>
 *     <li>Receipt Image</li>
 * </ul>
 *
 */
public class Reimbursement extends AbstractReimbursement {

    public Reimbursement() {
        super();
    }

    /**
     * This includes the minimum parameters needed for the {@link com.revature.models.AbstractReimbursement} class.
     * If other fields are needed, please create additional constructors.
     */
//    public Reimbursement(int id, Status status, User author, User resolver, double amount) {
//        super(id, status, author, resolver, amount);
//    }
    
    public Reimbursement(int id, double amount, int status, int author, int resolver) {
        super(id, amount, status, author, resolver);
    }
    
    public Reimbursement(double amount, int status) {
    	super(amount, status);
    }
    
    public Reimbursement(double amount, int author, int status) {
    	super(amount, author, status);
    }
}

