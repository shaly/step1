package com.syf.demo.msg;

import java.util.ArrayList;
import java.util.List;

/**计算分页工具类
 * 
 * @classDesc: 功能描述:(Java集合工具类)
 * @author: Jane
 * @createTime: 2019年12月03日
 */
public class ListUtil {
	static public<T> List<List<T>> splitList(List<T> list, int count) {
		int listSize = list.size();
		int page = (listSize + (count - 1)) / count;
		List<List<T>>listArray = new ArrayList<List<T>>();
		for (int i = 0; i<page; i++) {
			List<T> subList = new ArrayList<T>();
			for (int j = 0; j<listSize; j++) {
				int pageIndex = ((j + 1) + (count - 1)) / count;
				if (pageIndex == (i + 1)) {
					subList.add(list.get(j));
				}
				if ((j + 1) == ((j + 1) * count)) {
					break;
				}
			}
			listArray.add(subList);
		}
		return listArray;
	}
}
