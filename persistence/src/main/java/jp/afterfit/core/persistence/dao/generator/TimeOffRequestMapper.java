package jp.afterfit.core.persistence.dao.generator;

import java.util.List;
import jp.afterfit.core.domain.entity.generator.TimeOffRequest;
import jp.afterfit.core.domain.entity.generator.TimeOffRequestCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface TimeOffRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    long countByExample(TimeOffRequestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    int deleteByExample(TimeOffRequestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer requestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    int insert(TimeOffRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    int insertSelective(TimeOffRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    List<TimeOffRequest> selectByExampleWithRowbounds(TimeOffRequestCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    List<TimeOffRequest> selectByExample(TimeOffRequestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    TimeOffRequest selectByPrimaryKey(Integer requestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TimeOffRequest record, @Param("example") TimeOffRequestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TimeOffRequest record, @Param("example") TimeOffRequestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TimeOffRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeOffRequest record);
}