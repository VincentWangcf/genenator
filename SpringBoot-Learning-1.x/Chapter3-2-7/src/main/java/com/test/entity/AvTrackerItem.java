package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvTrackerItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column av_tracker_item.id
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column av_tracker_item.order_item_num
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    private Long orderItemNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column av_tracker_item.av_tracker_id
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    private String avTrackerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column av_tracker_item.av_tracker_status
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    private Byte avTrackerStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column av_tracker_item.change_times
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    private Date changeTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column av_tracker_item.change_cancel
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    private String changeCancel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column av_tracker_item.av_profit
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    private BigDecimal avProfit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column av_tracker_item.id
     *
     * @return the value of av_tracker_item.id
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column av_tracker_item.id
     *
     * @param id the value for av_tracker_item.id
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column av_tracker_item.order_item_num
     *
     * @return the value of av_tracker_item.order_item_num
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public Long getOrderItemNum() {
        return orderItemNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column av_tracker_item.order_item_num
     *
     * @param orderItemNum the value for av_tracker_item.order_item_num
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public void setOrderItemNum(Long orderItemNum) {
        this.orderItemNum = orderItemNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column av_tracker_item.av_tracker_id
     *
     * @return the value of av_tracker_item.av_tracker_id
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public String getAvTrackerId() {
        return avTrackerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column av_tracker_item.av_tracker_id
     *
     * @param avTrackerId the value for av_tracker_item.av_tracker_id
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public void setAvTrackerId(String avTrackerId) {
        this.avTrackerId = avTrackerId == null ? null : avTrackerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column av_tracker_item.av_tracker_status
     *
     * @return the value of av_tracker_item.av_tracker_status
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public Byte getAvTrackerStatus() {
        return avTrackerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column av_tracker_item.av_tracker_status
     *
     * @param avTrackerStatus the value for av_tracker_item.av_tracker_status
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public void setAvTrackerStatus(Byte avTrackerStatus) {
        this.avTrackerStatus = avTrackerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column av_tracker_item.change_times
     *
     * @return the value of av_tracker_item.change_times
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public Date getChangeTimes() {
        return changeTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column av_tracker_item.change_times
     *
     * @param changeTimes the value for av_tracker_item.change_times
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public void setChangeTimes(Date changeTimes) {
        this.changeTimes = changeTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column av_tracker_item.change_cancel
     *
     * @return the value of av_tracker_item.change_cancel
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public String getChangeCancel() {
        return changeCancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column av_tracker_item.change_cancel
     *
     * @param changeCancel the value for av_tracker_item.change_cancel
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public void setChangeCancel(String changeCancel) {
        this.changeCancel = changeCancel == null ? null : changeCancel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column av_tracker_item.av_profit
     *
     * @return the value of av_tracker_item.av_profit
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public BigDecimal getAvProfit() {
        return avProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column av_tracker_item.av_profit
     *
     * @param avProfit the value for av_tracker_item.av_profit
     *
     * @mbggenerated Tue Jan 07 21:13:02 CST 2020
     */
    public void setAvProfit(BigDecimal avProfit) {
        this.avProfit = avProfit;
    }
}