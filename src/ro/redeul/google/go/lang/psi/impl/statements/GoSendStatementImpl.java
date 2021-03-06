/*
* Copyright 2012 Midokura Europe SARL
*/
package ro.redeul.google.go.lang.psi.impl.statements;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ro.redeul.google.go.lang.psi.expressions.GoExpr;
import ro.redeul.google.go.lang.psi.impl.GoPsiElementBase;
import ro.redeul.google.go.lang.psi.statements.GoSendStatement;
import ro.redeul.google.go.lang.psi.visitors.GoElementVisitor;

/**
 * // TODO: mtoader ! Please explain yourself.
 */
public class GoSendStatementImpl extends GoPsiElementBase implements GoSendStatement {

    public GoSendStatementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public GoExpr getChannelExpr() {
        return null;
    }

    @NotNull
    @Override
    public GoExpr getValueExpr() {
        return null;
    }

    @Override
    public void accept(GoElementVisitor visitor) {
        visitor.visitSendStatement(this);
    }
}
