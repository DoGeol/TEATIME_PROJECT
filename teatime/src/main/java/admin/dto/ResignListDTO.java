package admin.dto;

import member.dto.MemberDTO;

public class ResignListDTO extends MemberDTO {
	 
	private int timeOut;


	
	public int getTimeOut() {return timeOut;}
	public void setTimeOut(int timeOut) {this.timeOut = timeOut;}

	
	public ResignListDTO() {super();}
	
	public ResignListDTO(int idx, String userId, String userPw, String userName, String userNick, String userPhone,
			String userEmail, String userPostcode, String userAddress1, String userAddress2, String userGender,
			String userBirthday, String userIndate, int userPermission, int timeOut) {
		super(idx, userId, userPw, userName, userNick, userPhone, userEmail, userPostcode, userAddress1, userAddress2,
				userGender, userBirthday, userIndate, userPermission);
		this.timeOut = timeOut;
	}
	
	
	

	
	
}
