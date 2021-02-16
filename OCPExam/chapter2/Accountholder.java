package OCPExam.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Accountholder {

    private int accountno;
    private String address;
    private boolean good = true;

    List<String> add = new ArrayList();

    public Accountholder(int i, String address) {
        this.accountno = i;
        this.address = address;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public List<String> getAdd() {
        return add;
    }

    public void setAdd(List<String> add) {
        this.add = add;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }
}
