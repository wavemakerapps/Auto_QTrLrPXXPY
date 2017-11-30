/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.auto_qtrlrpxxpy.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.auto_qtrlrpxxpy.hrdb.Vacation;

/**
 * Service object for domain model class {@link Vacation}.
 */
public interface VacationService {

    /**
     * Creates a new Vacation. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Vacation if any.
     *
     * @param vacation Details of the Vacation to be created; value cannot be null.
     * @return The newly created Vacation.
     */
	Vacation create(@Valid Vacation vacation);


	/**
	 * Returns Vacation by given id if exists.
	 *
	 * @param vacationId The id of the Vacation to get; value cannot be null.
	 * @return Vacation associated with the given vacationId.
     * @throws EntityNotFoundException If no Vacation is found.
	 */
	Vacation getById(Integer vacationId) throws EntityNotFoundException;

    /**
	 * Find and return the Vacation by given id if exists, returns null otherwise.
	 *
	 * @param vacationId The id of the Vacation to get; value cannot be null.
	 * @return Vacation associated with the given vacationId.
	 */
	Vacation findById(Integer vacationId);


	/**
	 * Updates the details of an existing Vacation. It replaces all fields of the existing Vacation with the given vacation.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Vacation if any.
     *
	 * @param vacation The details of the Vacation to be updated; value cannot be null.
	 * @return The updated Vacation.
	 * @throws EntityNotFoundException if no Vacation is found with given input.
	 */
	Vacation update(@Valid Vacation vacation) throws EntityNotFoundException;

    /**
	 * Deletes an existing Vacation with the given id.
	 *
	 * @param vacationId The id of the Vacation to be deleted; value cannot be null.
	 * @return The deleted Vacation.
	 * @throws EntityNotFoundException if no Vacation found with the given id.
	 */
	Vacation delete(Integer vacationId) throws EntityNotFoundException;

	/**
	 * Find all Vacations matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Vacations.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Vacation> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Vacations matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Vacations.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Vacation> findAll(String query, Pageable pageable);

    /**
	 * Exports all Vacations matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Vacations in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Vacation.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}

