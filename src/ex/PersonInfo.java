package ex;

/*
 * 該筆資料(列)的 所有參數
 * 歲數,身高,體重以及存放時間
 */
public class PersonInfo {
	
	public final String gender;
	public final int age;
	public final float height;
	public final float weight;
	public final long time;
	
	public PersonInfo(String gender,int age,float height,float weight,long time){
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.time = time;
	}
	
	public String toString(){
		return "gender:"+gender+",age:"+age+",height:"+height+",weight:"+weight+" @ "+time;
	}

}
