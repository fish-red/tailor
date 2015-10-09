package com.sleekbyte.tailor.functional;

import com.sleekbyte.tailor.common.Messages;
import com.sleekbyte.tailor.common.Rules;
import com.sleekbyte.tailor.common.Severity;
import com.sleekbyte.tailor.output.Printer;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Functional tests for TodoCommentListener.
 */
@RunWith(MockitoJUnitRunner.class)
public class TodoCommentTest extends RuleTest {

    @Override
    protected void addAllExpectedMsgs() {
        addExpectedMsg(1);
        addExpectedMsg(4);
        addExpectedMsg(6);
        addExpectedMsg(9);
        addExpectedMsg(10);
        addExpectedMsg(13);
    }

    private void addExpectedMsg(int line) {
        expectedMessages.add(
            Printer.genOutputStringForTest(Rules.TODO_SYNTAX, inputFile.getName(), line, Severity.WARNING,
                Messages.TODOS + Messages.TODO_SYNTAX));
    }

}
