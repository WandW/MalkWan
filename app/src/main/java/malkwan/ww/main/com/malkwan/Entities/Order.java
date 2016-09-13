package malkwan.ww.main.com.malkwan.Entities;

public class Order {
int order_Id,user_Id,state,price,album_Id;
String time;

	public int getOrder_Id() {
		return order_Id;
	}

	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAlbum_Id() {
		return album_Id;
	}

	public void setAlbum_Id(int album_Id) {
		this.album_Id = album_Id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
