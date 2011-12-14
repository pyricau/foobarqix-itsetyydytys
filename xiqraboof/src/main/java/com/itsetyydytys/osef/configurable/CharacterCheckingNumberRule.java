package com.itsetyydytys.osef.configurable;

import java.util.List;

public class CharacterCheckingNumberRule implements NumberRule {

	private final List<CharacterRule> characterRules;

	public CharacterCheckingNumberRule(List<CharacterRule> characterRules) {
		this.characterRules = characterRules;
	}

	@Override
	public String apply(int number) {
		StringBuilder stringBuilder = new StringBuilder();

		String numberAsString = Integer.toString(number);

		for (int i = 0; i < numberAsString.length(); i++) {
			char checkedChar = numberAsString.charAt(i);
			for (CharacterRule characterRule : characterRules) {
				if (characterRule.matches(checkedChar)) {
					String content = characterRule.content();
					stringBuilder.append(content);
					break;
				}
			}
		}

		return stringBuilder.toString();
	}

}
