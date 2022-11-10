import axios from "axios";
import data from "../db/mock.json";

export const getData = () => {
  return data;
};

// 고양이정보
export const axiosCatData = async () => {
  const response = await axios.get(
    "https://raw.githubusercontent.com/domini04/mini_project/sungmin/CatDataTest"
  );

  return response.data;
};

// 고양이사진
export const axiosCatPictures = async () => {
  const response = await axios.get(
    "https://raw.githubusercontent.com/domini04/mini_project/sungmin/PicturesDataTest"
  );

  return response.data;
};
