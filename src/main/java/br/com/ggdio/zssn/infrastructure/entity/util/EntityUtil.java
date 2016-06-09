package br.com.ggdio.zssn.infrastructure.entity.util;

import br.com.ggdio.zssn.shared.UniqueKey;
import br.com.ggdio.zssn.util.CharacterUtil;

public class EntityUtil {

	public static Character getUniqueChar(UniqueKey key) {
		if(key == null) return null;
		return CharacterUtil.getFirstChar(key.getKey());
	}
	
}
