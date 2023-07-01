class Employee{
	int empid;
	String ename;
	int Basicpay;
	int DA;
	int HRA;
	int PF;
	Employee(int empid , String enmae, int Basicpay){
		this.empid = empid;
		this.ename = ename;
		this.Basicpay = Basicpay;
		DA = DA+(Basicpay*0.1);
		HRA = HRA+(Basicpay*0.5);
		PF = PF+(Basicpay*0.01);
		
}