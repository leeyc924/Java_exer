package java_20_06_27;

public class SkillTree {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		int answer = 0;
		for (int i = 0; i < skill_trees.length; i++) {
			int k = 0;
			for(int j = 0;i<skill_trees[i].length();i++) {
				if (skill.charAt(k) == skill_trees[i].charAt(j)) {
					k++;
				}			
			}
			if (k > 0) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}