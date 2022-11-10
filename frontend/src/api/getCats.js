import axios from "axios";
import data from "../db/mock.json";

export const getData = () => {
  return data;
};

// axios
export const axiosData = async () => {
  const response = await axios.get(
    "https://raw.githubusercontent.com/domini04/mini_project/sungmin/axiosTestData"
  );

  return response.data;
};
