/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package fr.ritaly.dungeonmaster.item;

import org.apache.commons.lang.Validate;

import fr.ritaly.dungeonmaster.champion.body.BodyPart;
import fr.ritaly.dungeonmaster.magic.PowerRune;

/**
 * @author <a href="mailto:francois.ritaly@free.fr">Francois RITALY</a>
 */
public class Weapon extends Item {

	public Weapon(Type type) {
		super(type);

		Validate.isTrue(Item.Category.WEAPON.getTypes().contains(type),
				"The given item type " + type + " isn't a weapon");
	}
	
	public Weapon(Type type, PowerRune curse) {
		this(type);

		curse(curse);
	}

	@Override
	protected BodyPart.Type getActivationBodyPart() {
		return BodyPart.Type.WEAPON_HAND;
	}

	@Override
	public final int getAntiMagic() {
		return 0;
	}

	@Override
	public final int getShield() {
		return 0;
	}
}