package cn.itcast.action;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.entity.Student;

public class ParamAction2 extends ActionSupport{
	private static final long serialVersionUID = -7956142537283570931L;
	
	private List<Student> list;

	private Map<String, Student> map;

	

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Map<String, Student> getMap() {
		return map;
	}

	public void setMap(Map<String, Student> map) {
		this.map = map;
	}

	public void testListParam() {
		if(list != null && list.size() != 0) {
			for (Student stu : list) {
				System.out.println("name: " + stu.getName());
				System.out.println("age: " + stu.getAge());
			}
		}else {
			System.out.println("list 封装失败");
		}
	}
	
	public void testMapParam() {
		if(map != null && map.size() != 0) {
			Set<Entry<String, Student>> set = map.entrySet();
			for (Entry<String, Student> entry : set) {
				System.out.println("name : " + entry.getValue().getName());
				System.out.println("age : " + entry.getValue().getAge());
			}
		}else {
			System.out.println("map 封装失败");
		}
	}
}
