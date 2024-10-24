/*
 * Copyright (c) 2002-2021, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.dansmarue.business.dao;

import java.util.List;

import fr.paris.lutece.plugins.dansmarue.business.entities.Adresse;

/**
 * The Interface IAdresseDAO.
 */
public interface IAdresseDAO
{

    /**
     * Save a new address.
     *
     * @param address
     *            the address
     * @return the address id
     */
    public Long insert( Adresse address );

    /**
     * Delete an address.
     *
     * @param lId
     *            the address id
     */
    public void remove( long lId );

    /**
     * Load a address.
     *
     * @param lId
     *            the address id
     * @return the address
     */
    public Adresse load( long lId );

    /**
     * Store an address.
     *
     * @param address
     *            the address object
     */
    public void store( Adresse address );

    /**
     * Find address for a report id.
     *
     * @param lIdSignalement
     *            the report id
     * @return list of address
     */
    List<Adresse> findBySignalementId( long lIdSignalement );

    /**
     * Load an address by its Id report.
     *
     * @param lId
     *            the report id
     * @return the address
     */
    Adresse loadByIdSignalement( long lId );

    /**
     * Update an adresse.
     *
     * @param adresse
     *            the address
     */
    void update( Adresse adresse );

    /**
     * Update adresse.
     *
     * @param adresse
     *            the adresse
     */
    void updateAdresse( Adresse adresse );

    /**
     * Find wrong adresses (empty or without CP).
     *
     * @return the list
     */
    public List<Adresse> findWrongAdresses( );

    /**
     * Fix adresses avec E-Arrondissement.
     */
    void fixSyntaxeArrondissement( );

    /**
     * Fix adresses en Parigi pour la ville.
     */
    void fixVille( );

    /**
     * Fix adresses qui n'ont pas de virgule avant le code postale.
     */
    void fixVirguleCP( );

    /**
     * Sets the coordonate to WSG84.
     *
     * @param adresse
     *            the adresse
     * @return the adresse
     */
    public Adresse setCoordonateLambert93ToWSG84( Adresse adresse );
}
