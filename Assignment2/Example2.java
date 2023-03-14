package Assignment2;

import java.util.LinkedList;
import java.util.List;

public class Example2 {
	public static String destCity(List<List<String>> paths) {
		String output = null;
		List<String> ParentList = new LinkedList<>();
		List<String> ChildList = new LinkedList<>();
		for (List<String> individualElementsFromPaths : paths) {
			String ParentElement = individualElementsFromPaths.get(0);
			String ChildElement = individualElementsFromPaths.get(1);
			ParentList.add(ParentElement);
			ChildList.add(ChildElement);
		}
		for (int i = 0; i < ParentList.size(); i++) {
			String incomingElement = ChildList.get(i);
			if (!ParentList.contains(incomingElement)) {
				output = incomingElement;
				break;
			}
		}
		return output;
	}

	public static void main(String args[]) {
		List<List<String>> testList = new LinkedList<>();
		List<String> path1 = getPath("A", "Z");
		testList.add(path1);
		String returnDest = destCity(testList);
		System.out.println(returnDest);
	}

	private static List<String> getPath(String source, String destination) {
		List<String> path = new LinkedList<>();
		path.add(source);
		path.add(destination);
		return path;
	}
}