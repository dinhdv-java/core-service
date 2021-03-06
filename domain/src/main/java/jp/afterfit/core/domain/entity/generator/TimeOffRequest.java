package jp.afterfit.core.domain.entity.generator;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TimeOffRequest implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_off_request.request_id
     *
     * @mbg.generated
     */
    private Integer requestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_off_request.type_off
     *
     * @mbg.generated
     */
    private String typeOff;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_off_request.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_off_request.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.time_off_request.backup_user
     *
     * @mbg.generated
     */
    private String backupUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.time_off_request
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}