package Encapsulation;

class Account {
    private long acc_no;
    private String name, email;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    };

    public void setAcc_no(long ACC_NO) {
        this.acc_no = ACC_NO;
    };

    public String getName() {
        return name;
    };

    public void setName(String NAME) {
        this.name = NAME;
    };

    public String getEmail() {
        return email;
    };

    public void setEmail(String EMAIL) {
        this.email = EMAIL;
    };

    public float getAmount() {
        return amount;
    };

    public void setAmount(float AMOUNT) {
        this.amount = AMOUNT;
    };

    @Override
    public String toString() {
        return "Account [acc_no= " + acc_no + ", name= " + name + ", email= " + email + ", amount= " + amount + "]";
    }

    /**
     * @return
     */
    public String[] getUserInfo() {
        // String acc = String.format( "%s", acc_no);
        String acc = "" + acc_no;
        // String amnt = String.format( "%s", amount);
        String amnt = "" + acc_no;
        String[] info = { name, email, acc, amnt };
        return info;
    }

    /**
     * @param args
     */
    public static void main(String args[]) {
        Account John = new Account();
        John.setAcc_no(480939845859493L);
        John.setAmount(4000);
        John.setName("john Doe");
        John.setEmail("JohnDoe@email.com");
        String JonDoe = John.toString();
        System.out.println(JonDoe);
    }
}
