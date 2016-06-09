package br.com.ggdio.zssn.domain.enumeration;

import br.com.ggdio.zssn.shared.UniqueKey;

/**
 * Enumeration for gender
 * @author Dio
 *
 */
public enum Gender implements UniqueKey {
	MALE,
	FEMALE
	;

	@Override
	public String getKey() {
		return toString();
	}
}
