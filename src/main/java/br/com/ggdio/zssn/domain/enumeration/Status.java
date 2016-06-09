package br.com.ggdio.zssn.domain.enumeration;

import br.com.ggdio.zssn.shared.UniqueKey;

/**
 * Enumeration for status
 * @author Dio
 *
 */
public enum Status implements UniqueKey {

	ALIVE,
	INFECTED,
	DECEASED
	;

	@Override
	public String getKey() {
		return toString();
	}
	
}