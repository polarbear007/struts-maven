package cn.itcast.convertor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateConvertor extends DefaultTypeConverter {
	@Override
	public Object convertValue(Object value, Class toType) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		if(value != null) {
			if(toType == Date.class) {
				try {
					// 注意如果value 是表单参数，那么value 本质上是一个字符串数组，不能直接当成字符串，会转换失败
					String[] params = (String[]) value;
					return sdf.parse(params[0]);
				} catch (ParseException e) {
					e.printStackTrace();
					// 如果解析转换失败，那么我们就用父类的转换方式，如果父类也转换不了，那么就会由父类去
					// 添加错误信息
					return super.convertValue(value, toType);
				}
			}else if(toType == String.class) {
				return sdf.format(value);
			}
		}
		
		return super.convertValue(value, toType);
		
	}
}
