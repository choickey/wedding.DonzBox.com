package egovframework.mbl.com.mms.service;

/**
 * 개요
 * - MMS 전송정보에 대한 model을 정의한다.
 * 
 * 상세내용
 * - MMS 전송 정보를 관리한다.
 * @author 조재만
 * @since 2011.08.26
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2011.08.30  조재만          최초 생성
 *
 * </pre>
 */
public class MmsTransInfo {
    /** 순번 */
    private int sn;

    /** 회원ID */
    private String mberId;

    /** 송신번호 */
    private String trnsmisNo;

    /** 수신번호 */
    private String recptnNo;

    /** 전송일시 */
    private String trnsmisDt;
    
    /** 메시지 제목 */
    private String mssageSj;
    
    /** 메시지 내용 */
    private String mssageCn;
    
    /** 메시지 ID */
    private String mssageId;
    
    /** 요청결과명 */
    private String rqesterResultNm;

    /** 전송결과명 */
    private String trnsmisResultNm;

    /** 전송확인일시 */
    private String trnsmisConfirmDt;
    
    /** 첨부파일 */
    private AttachFile attachFile = new AttachFile();
    
    /**
     * 순번을 가져온다.
     * @return int 순번
     */
    public int getSn() {
        return sn;
    }

    /**
     * 순번을 저장한다.
     * 
     * @param sn
     */
    public void setSn(int sn) {
        this.sn = sn;
    }

    /**
     * 회원ID를 가져온다.
     * @return String 회원ID
     */
    public String getMberId() {
        return mberId;
    }

    /**
     * 회원ID를 저장한다.
     * 
     * @param mberId
     */
    public void setMberId(String mberId) {
        this.mberId = mberId;
    }

    /**
     * 송신번호를 가져온다.
     * @return String 송신번호
     */
    public String getTrnsmisNo() {
        return trnsmisNo;
    }

    /**
     * 송신번호를 저장한다.
     * 
     * @param trnsmisNo
     */
    public void setTrnsmisNo(String trnsmisNo) {
        this.trnsmisNo = trnsmisNo;
    }

    /**
     * 수신번호를 가져온다.
     * @return String 수신번호
     */
    public String getRecptnNo() {
        return recptnNo;
    }

    /**
     * 수신번호를 저장한다.
     * 
     * @param recptnNo
     */
    public void setRecptnNo(String recptnNo) {
        this.recptnNo = recptnNo;
    }

    /**
     * 전송일시를 가져온다.
     * @return String 전송일시
     */
    public String getTrnsmisDt() {
        return trnsmisDt;
    }

    /**
     * 전송일시를 저장한다.
     * 
     * @param trnsmisDt
     */
    public void setTrnsmisDt(String trnsmisDt) {
        this.trnsmisDt = trnsmisDt;
    }

    /**
     * 메시지 제목을 가져온다.
     * @return String 메시지 제목
     */
    public String getMssageSj() {
        return mssageSj;
    }

    /**
     * 메시지 제목을 저장한다.
     * 
     * @param mssageSj
     */
    public void setMssageSj(String mssageSj) {
        this.mssageSj = mssageSj;
    }

    /**
     * 메시지 내용을 가져온다.
     * @return String 메시지 내용
     */
    public String getMssageCn() {
        return mssageCn;
    }

    /**
     * 메시지 내용을 저장한다.
     * 
     * @param mssageCn
     */
    public void setMssageCn(String mssageCn) {
        this.mssageCn = mssageCn;
    }
    
    /**
     * 메시지 ID를 가져온다.
     * @return String 메시지 ID
     */
    public String getMssageId() {
        return mssageId;
    }

    /**
     * 메시지 ID를 저장한다.
     * 
     * @param mssageId
     */
    public void setMssageId(String mssageId) {
        this.mssageId = mssageId;
    }

    /**
     * 요청결과명을 가져온다.
     * @return String 요청결과명
     */
    public String getRqesterResultNm() {
        return rqesterResultNm;
    }

    /**
     * 요청결과명을 저장한다.
     * 
     * @param rqesterResultNm
     */
    public void setRqesterResultNm(String rqesterResultNm) {
        this.rqesterResultNm = rqesterResultNm;
    }

    /**
     * 전송결과명을 가져온다.
     * @return String 전송결과명
     */
    public String getTrnsmisResultNm() {
        return trnsmisResultNm;
    }
    
    /**
     * 전송결과명을 저장한다.
     * 
     * @param trnsmisResultNm
     */
    public void setTrnsmisResultNm(String trnsmisResultNm) {
        this.trnsmisResultNm = trnsmisResultNm;
    }

    /**
     * 전송확인일시를 가져온다.
     * @return String 전송확인일시
     */
    public String getTrnsmisConfirmDt() {
        return trnsmisConfirmDt;
    }

    /**
     * 전송확인일시를 저장한다.
     * 
     * @param trnsmisConfirmDt
     */
    public void setTrnsmisConfirmDt(String trnsmisConfirmDt) {
        this.trnsmisConfirmDt = trnsmisConfirmDt;
    }

    /**
     * 첨부파일을 가져온다.
     * @return AttachFile 첨부파일
     */
    public AttachFile getAttachFile() {
        return attachFile;
    }

    /**
     * 첨부파일을 저장한다.
     * 
     * @param attachFile
     */
    public void setAttachFile(AttachFile attachFile) {
        this.attachFile = attachFile;
    }
}
