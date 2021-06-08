package capgeminiInternships.InheritancePolymorphism;
class Person
{
	private String name;
	private float age;
	Person(String name,float age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}
class Account
{
	private static long accnumgenerator = 0;
	private long accNum = 0;
	private double balance;
	private Person accHolder;
	public Account()
	{
		
	}
	public Account(double balance, Person accHolder) {
		this.accNum = ++accnumgenerator;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		
		if(amount<=(this.balance-500))
			balance-=amount;
		else
			System.out.println("Not sufficient balance");
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
}
class SavingsAccount extends Account
{
	private final double minimumBalance = 500;

	public SavingsAccount() {
		super();
	}
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super( balance, accHolder);
	}
	public void withdraw(double amount)
	{
		if(amount<=(super.getBalance()-minimumBalance))
			super.withdraw(amount);
	}
}
class currentAccount extends Account
{
	private final int overDraftlimit = 500;

	public currentAccount() {
		super();
	}
	public currentAccount(long accNum, double balance, Person accHolder) {
		super(balance, accHolder);
	}
	public void withdraw(double amount)
	{
		if(this.valid(amount))
			super.withdraw(amount);
	}
	private boolean valid(double amount)
	{
		if(super.getBalance()-amount-overDraftlimit<0)
			return false;
		else
			return true;
	}
}
public class exercise1 {
	public static void main(String a[])throws Exception
	{
		Person p1 = new Person("Smith",20);
		Person p2 = new Person("Kathay",22);
		Account a1 = new Account(2000,p1);
		Account a2 = new Account(3000,p2);
		a2.withdraw(2000);
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());	
	}
}
