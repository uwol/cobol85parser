/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.procedure.impl;

import java.util.ArrayList;
import java.util.List;

import io.proleap.cobol.Cobol85Parser.InvalidKeyPhraseContext;
import io.proleap.cobol.parser.metamodel.ProgramUnit;
import io.proleap.cobol.parser.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.parser.metamodel.procedure.InvalidKey;
import io.proleap.cobol.parser.metamodel.procedure.Statement;

public class InvalidKeyImpl extends CobolDivisionElementImpl implements InvalidKey {

	protected final InvalidKeyPhraseContext ctx;

	protected List<Statement> statements = new ArrayList<Statement>();

	public InvalidKeyImpl(final ProgramUnit programUnit, final InvalidKeyPhraseContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public void addStatement(final Statement statement) {
		statements.add(statement);
	}

	@Override
	public List<Statement> getStatements() {
		return statements;
	}

}