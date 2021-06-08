package capgeminiInternships.lambdaExpressionsStreamAPI.StreamAPI;

public class Department {
	private Integer departmentId;
	private Integer managerId;
	private String departmentName;
	public Department(Integer departmentId, Integer managerId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.managerId = managerId;
		this.departmentName = departmentName;
	}
	public Department() {
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", managerId=" + managerId + ", departmentName="
				+ departmentName + "]";
	}
	
}
