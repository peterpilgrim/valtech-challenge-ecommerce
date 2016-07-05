/*******************************************************************************
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2016 by Peter Pilgrim, Milton Keynes, UK for  XeNoNiQUe UK
 * PILGRIM ENGINEERING ARCHITECTURE TECHNOLOGY UK LTD
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU GPL v3.0
 * which accompanies this distribution, and is available at:
 * http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Developers:
 * Peter Pilgrim -- design, development and implementation
 *               -- Blog: http://www.xenonique.co.uk/blog/
 *               -- Twitter: @peter_pilgrim
 *
 * Contributors:
 *
 *******************************************************************************/

package uk.co.xenonique.clients.valtech

/**
  * The type CartItem
  *
  * @author Peter Pilgrim (peter)
  */

class CartItem( val name: String, var price: BigDecimal)

object CartItem {
  val Orange = new CartItem( "Orange", 0.60)
  val Apple = new CartItem("Apple", 0.25)
}
