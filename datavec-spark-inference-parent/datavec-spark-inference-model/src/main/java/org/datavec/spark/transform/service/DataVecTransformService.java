package org.datavec.spark.transform.service;

import org.datavec.api.transform.TransformProcess;
import org.datavec.image.transform.ImageTransformProcess;
import org.datavec.spark.transform.model.*;

import java.io.IOException;

/**
 * Created by agibsonccc on 6/12/17.
 */
public interface DataVecTransformService {

    String SEQUENCE_OR_NOT_HEADER = "Sequence";


    /**
     *
     * @param transformProcess
     */
    void setCSVTransformProcess(TransformProcess transformProcess);

    /**
     *
     * @param imageTransformProcess
     */
    void setImageTransformProcess(ImageTransformProcess imageTransformProcess);

    /**
     *
     * @return
     */
    TransformProcess getCSVTransformProcess();

    /**
     *
     * @return
     */
    ImageTransformProcess getImageTransformProcess();

    /**
     *
     * @param singleCsvRecord
     * @return
     */
    SingleCSVRecord transformIncremental(SingleCSVRecord singleCsvRecord);

    SequenceBatchCSVRecord transform(SequenceBatchCSVRecord batchCSVRecord);

    /**
     *
     * @param batchCSVRecord
     * @return
     */
    BatchCSVRecord transform(BatchCSVRecord batchCSVRecord);

    /**
     *
     * @param batchCSVRecord
     * @return
     */
    Base64NDArrayBody transformArray(BatchCSVRecord batchCSVRecord);

    /**
     *
     * @param singleCsvRecord
     * @return
     */
    Base64NDArrayBody transformArrayIncremental(SingleCSVRecord singleCsvRecord);

    /**
     *
     * @param singleImageRecord
     * @return
     * @throws IOException
     */
    Base64NDArrayBody transformIncrementalArray(SingleImageRecord singleImageRecord) throws IOException;

    /**
     *
     * @param batchImageRecord
     * @return
     * @throws IOException
     */
    Base64NDArrayBody transformArray(BatchImageRecord batchImageRecord) throws IOException;

    /**
     *
     * @param singleCsvRecord
     * @return
     */
    Base64NDArrayBody transformSequenceArrayIncremental(BatchCSVRecord singleCsvRecord);

    /**
     *
     * @param batchCSVRecord
     * @return
     */
    Base64NDArrayBody transformSequenceArray(SequenceBatchCSVRecord batchCSVRecord);

    /**
     *
     * @param batchCSVRecord
     * @return
     */
    SequenceBatchCSVRecord transformSequence(SequenceBatchCSVRecord batchCSVRecord);

    /**
     *
     * @param transform
     * @return
     */
    SequenceBatchCSVRecord transformSequenceIncremental(BatchCSVRecord transform);
}
