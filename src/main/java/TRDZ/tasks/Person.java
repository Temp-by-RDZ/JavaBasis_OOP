package TRDZ.tasks;

public class Person {

    private String FIO;
    private String Job;
    private String Mail;
    private long Contact;//0(000)000-00-00
    private int Payment;
    private int Age;
    private final int MyID;
    static int ID;

    {//def initialize
        FIO = "Unknown";
        Job = "Unknown";
        Mail = "Unknown";
        Contact = 10000000000L;
        Payment = 0;
        Age = 0;
        MyID=++ID;
        }

    Person() {}
    Person(String FIO,String Job,String Mail, long Contact, int Payment, int Age) {
        this.FIO = FIO;
        this.Job = Job;
        this.Mail = Mail;
        this.Contact = Contact;
        this.Payment = Payment;
        this.Age = Age;
        }

    void set_FIO(String FIO) {this.FIO = FIO;}
    void set_Job(String Job) {this.Job = Job;}
    void set_Mail(String Mail) {this.Mail = Mail;}
    void set_Contact(long Contact) {this.Contact = Contact;}
    void set_Contact(int cont, int code, int numb) {
        this.Contact=Math.max(1000000,Math.min(numb,9999999))+Math.max(100,Math.min(code,999))*10000000L+Math.max(1,Math.min(cont,9))*10000000000L;}
    void set_Payment(int Payment) {this.Payment = Payment;}
    void set_Age(int Age) {this.Age = Age;}

    public int get_Age() {return Age;}

    public void Show() {
        System.out.printf("%d. Сотрудник- %-33s возраст- %d должности- %-13s с оплатой в %-6d Контакты: m: %-17s n- %d.\n",MyID,FIO,Age,Job,Payment,Mail,Contact);
        }

    }
