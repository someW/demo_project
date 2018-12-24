package com.enmCommonUse7;
/**
 * 用法四：覆盖枚举的方法
 * toString()方法覆盖的例子。
 * @author WBB
 *
 */
public enum CardEnum {
	fir_Acc("f_Acc","E","V","N"),
	sec_Acc("sec_Acc","E","V","N"),
	th_Acc("th_Acc","E","V","N"),
	auxCard("apcCard","Y","","N"),
	fir_SpeAcc("fir_SpeAcc","Y","","N");
	
	private String name;
	private String entity;
	private String vautal;
	private String isNot;
	private CardEnum(String name,String entity,String vautal, String isNot) {
		this.name = name;
		this.entity = entity;
		this.vautal = vautal;
		this.isNot = isNot;
	}

	public String getName() {
		return name;
	}

	public String getEntity() {
		return entity;
	}

	public String getVautal() {
		return vautal;
	}

	public String getIsNot() {
		return isNot;
	}
	
	public static void main(String[] args) {
		System.out.println(CardEnum.fir_Acc.isNot);
		
	}
}
