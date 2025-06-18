package rewards.internal.restaurant;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Loads restaurant aggregates. Called by the reward network to find and reconstitute Restaurant entities from an
 * external form such as a set of RDMS rows.
 * 
 * Objects returned by this repository are guaranteed to be fully-initialized and ready to use.
 */
@Repository
@Profile("stub")
public interface RestaurantRepository {

	/**
	 * Load a Restaurant entity by its merchant number.
	 * @param merchantNumber the merchant number
	 * @return the restaurant
	 */
	public Restaurant findByMerchantNumber(String merchantNumber);
}
