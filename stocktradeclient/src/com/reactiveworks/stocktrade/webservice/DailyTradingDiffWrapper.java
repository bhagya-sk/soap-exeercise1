
package com.reactiveworks.stocktrade.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dailyTradingDiffWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dailyTradingDiffWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dailyTrdDiff"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dailyTradingDiffWrapper", propOrder = {
    "dailyTrdDiff"
})
public class DailyTradingDiffWrapper {

    @XmlElement(required = true)
    protected DailyTradingDiffWrapper.DailyTrdDiff dailyTrdDiff;

    @Override
	public String toString() {
		return "DailyTradingDiffential ["+dailyTrdDiff + "]";
	}

	/**
     * Gets the value of the dailyTrdDiff property.
     * 
     * @return
     *     possible object is
     *     {@link DailyTradingDiffWrapper.DailyTrdDiff }
     *     
     */
    public DailyTradingDiffWrapper.DailyTrdDiff getDailyTrdDiff() {
        return dailyTrdDiff;
    }

    /**
     * Sets the value of the dailyTrdDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyTradingDiffWrapper.DailyTrdDiff }
     *     
     */
    public void setDailyTrdDiff(DailyTradingDiffWrapper.DailyTrdDiff value) {
        this.dailyTrdDiff = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class DailyTrdDiff {

        protected List<DailyTradingDiffWrapper.DailyTrdDiff.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DailyTradingDiffWrapper.DailyTrdDiff.Entry }
         * 
         * 
         */
        
        
        public List<DailyTradingDiffWrapper.DailyTrdDiff.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<DailyTradingDiffWrapper.DailyTrdDiff.Entry>();
            }
            return this.entry;
        }


        @Override
		public String toString() {
			return ""+entry;
		}


		/**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar key;
            protected Double value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setKey(XMLGregorianCalendar value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setValue(Double value) {
                this.value = value;
            }

			@Override
			public String toString() {
				return "{" + key + "," + value + "}";
			}

        }

    }

}
