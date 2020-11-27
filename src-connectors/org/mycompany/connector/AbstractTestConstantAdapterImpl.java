/**
 * 
 */
package org.mycompany.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

/**
 * This abstract class is generated and should not be modified.
 */
public abstract class AbstractTestConstantAdapterImpl extends AbstractConnector {

	protected final static String STRINGINPUT_INPUT_PARAMETER = "stringInput";
	protected final static String LONGINPUT_INPUT_PARAMETER = "longInput";
	protected final static String FLOATINPUT_INPUT_PARAMETER = "floatInput";
	protected final static String INTEGERINPUT_INPUT_PARAMETER = "integerInput";
	protected final static String DOUBLEINPUT_INPUT_PARAMETER = "doubleInput";
	protected final static String LOCALDATEINPUT_INPUT_PARAMETER = "localDateInput";
	protected final String STRINGOUPUT_OUTPUT_PARAMETER = "stringOuput";
	protected final String LONGOUTPUT_OUTPUT_PARAMETER = "longOutput";

	protected final java.lang.String getStringInput() {
		return (java.lang.String) getInputParameter(STRINGINPUT_INPUT_PARAMETER);
	}

	protected final java.lang.Long getLongInput() {
		return (java.lang.Long) getInputParameter(LONGINPUT_INPUT_PARAMETER);
	}

	protected final java.lang.Float getFloatInput() {
		return (java.lang.Float) getInputParameter(FLOATINPUT_INPUT_PARAMETER);
	}

	protected final java.lang.Integer getIntegerInput() {
		return (java.lang.Integer) getInputParameter(INTEGERINPUT_INPUT_PARAMETER);
	}

	protected final java.lang.Double getDoubleInput() {
		return (java.lang.Double) getInputParameter(DOUBLEINPUT_INPUT_PARAMETER);
	}

	protected final java.time.LocalDate getLocalDateInput() {
		return (java.time.LocalDate) getInputParameter(LOCALDATEINPUT_INPUT_PARAMETER);
	}

	protected final void setStringOuput(java.lang.String stringOuput) {
		setOutputParameter(STRINGOUPUT_OUTPUT_PARAMETER, stringOuput);
	}

	protected final void setLongOutput(java.lang.Long longOutput) {
		setOutputParameter(LONGOUTPUT_OUTPUT_PARAMETER, longOutput);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getStringInput();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("stringInput type is invalid");
		}
		try {
			getLongInput();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("longInput type is invalid");
		}
		try {
			getFloatInput();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("floatInput type is invalid");
		}
		try {
			getIntegerInput();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("integerInput type is invalid");
		}
		try {
			getDoubleInput();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("doubleInput type is invalid");
		}
		try {
			getLocalDateInput();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("localDateInput type is invalid");
		}

	}

}
