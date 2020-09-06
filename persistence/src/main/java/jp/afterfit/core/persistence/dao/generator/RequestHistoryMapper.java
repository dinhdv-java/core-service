package jp.afterfit.core.persistence.dao.generator;

import java.util.List;
import jp.afterfit.core.domain.entity.generator.RequestHistory;
import jp.afterfit.core.domain.entity.generator.RequestHistoryCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface RequestHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    long countByExample(RequestHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    int deleteByExample(RequestHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    int insert(RequestHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    int insertSelective(RequestHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    List<RequestHistory> selectByExampleWithRowbounds(RequestHistoryCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    List<RequestHistory> selectByExample(RequestHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    RequestHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RequestHistory record, @Param("example") RequestHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RequestHistory record, @Param("example") RequestHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RequestHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.request_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RequestHistory record);
}