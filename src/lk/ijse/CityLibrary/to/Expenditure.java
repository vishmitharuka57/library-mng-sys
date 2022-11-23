package lk.ijse.CityLibrary.to;

public class Expenditure {
    private String expenditureId ;
    private String description ;
    private double amount;
    private String date ;
    private String invoiceNo ;

    public Expenditure() {
    }

    public Expenditure(String expenditureId, String description, double amount, String date, String invoiceNo) {
        this.expenditureId = expenditureId;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.invoiceNo = invoiceNo;
    }

    public String getExpenditureId() {
        return expenditureId;
    }

    public void setExpenditureId(String expenditureId) {
        this.expenditureId = expenditureId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Override
    public String toString() {
        return "Expenditure{" +
                "expenditureId='" + expenditureId + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", invoiceNo='" + invoiceNo + '\'' +
                '}';
    }
}
