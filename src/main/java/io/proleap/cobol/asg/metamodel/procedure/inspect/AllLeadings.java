/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.inspect;

import java.util.List;

import io.proleap.cobol.Cobol85Parser.InspectAllLeadingContext;
import io.proleap.cobol.asg.metamodel.CobolDivisionElement;

public interface AllLeadings extends CobolDivisionElement {

	enum Type {
		ALL, LEADING
	}

	AllLeading addAllLeading(InspectAllLeadingContext ctx);

	List<AllLeading> getAllLeadings();

	Type getType();

	void setType(Type type);

}