package net.facility.db;

import java.sql.Timestamp;

public class FacilityDTO {
	//	<facilility table>						
	int facil_num;					//	자리 번호	int(3)	PK								해당 자리 번호
	Timestamp facil_stime;		//	시작시간	date									자리 이용 시작 시간
	Timestamp facil_etime;		//	종료시간	date									자리 이용 종료 시간
	String facil_use;				//	사용유무	char(2)	check in ('0','1')		자리 사용중인지 여부
	String facil_type;				//	자리유형	varchar(20)							해당 자리 유형
	
	//	<object table>						
	String obj_mname;			//	모델명		varchar(20)							물품 모델명
	String obj_type;				//	물품종류	varchar(20)	check in ('chair','desk','mouse','keyboard','computer')		물품의 종류
	String obj_enterprise;	//	업체명		varchar(20)							해당 물품 담당 업체명
	String obj_phone;			//	연락처		char(14)								담당업체 연락처			
	
	//getter, setter 구현
	public int getFacil_num() {
		return facil_num;
	}
	public void setFacil_num(int facil_num) {
		this.facil_num = facil_num;
	}
	public Timestamp getFacil_stime() {
		return facil_stime;
	}
	public void setFacil_stime(Timestamp facil_stime) {
		this.facil_stime = facil_stime;
	}
	public Timestamp getFacil_etime() {
		return facil_etime;
	}
	public void setFacil_etime(Timestamp facil_etime) {
		this.facil_etime = facil_etime;
	}
	public String getFacil_use() {
		return facil_use;
	}
	public void setFacil_use(String facil_use) {
		this.facil_use = facil_use;
	}
	public String getFacil_type() {
		return facil_type;
	}
	public void setFacil_type(String facil_type) {
		this.facil_type = facil_type;
	}
	public String getObj_mname() {
		return obj_mname;
	}
	public void setObj_mname(String obj_mname) {
		this.obj_mname = obj_mname;
	}
	public String getObj_type() {
		return obj_type;
	}
	public void setObj_type(String obj_type) {
		this.obj_type = obj_type;
	}
	public String getObj_enterprise() {
		return obj_enterprise;
	}
	public void setObj_enterprise(String obj_enterprise) {
		this.obj_enterprise = obj_enterprise;
	}
	public String getObj_phone() {
		return obj_phone;
	}
	public void setObj_phone(String obj_phone) {
		this.obj_phone = obj_phone;
	}
}
