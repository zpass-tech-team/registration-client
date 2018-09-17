/**
 * 
 */
package org.mosip.kernel.core.spi.idvalidator;

/**
 * Interface having a function to validate an Id
 * 
 * @author Dharmesh Khandelwal
 * @since 1.0.0
 *
 * @param <T>
 *            Type of Id
 */
public interface MosipIdValidator<T> {

	/**
	 * Function to validate given Id
	 * 
	 * @param id
	 *            The Id to validate
	 * @return true if Id is valid
	 */
	boolean validateId(T id);

}
